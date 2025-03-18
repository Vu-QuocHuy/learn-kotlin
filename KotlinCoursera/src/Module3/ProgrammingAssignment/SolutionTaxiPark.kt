package Module3.ProgrammingAssignment

fun TaxiPark.findFakeDrivers1(): Set<Driver> =
    allDrivers.filter { d -> trips.none { it.driver == d } }.toSet()

fun TaxiPark.findFakeDrivers2(): Set<Driver> =
    allDrivers - trips.map { it.driver }

fun TaxiPark.findFaithfulPassengers1(minTrips: Int): Set<Passenger> =
    trips
        .flatMap(Trip::passengers)
        .groupBy { passenger -> passenger }
        .filterValues { group -> group.size >= minTrips }
        .keys

fun TaxiPark.findFaithfulPassengers2(minTrips: Int): Set<Passenger> =
    allPassengers
        .filter { p ->
            trips.count { p in it.passengers } >= minTrips
        }
        .toSet()

fun TaxiPark.findFrequentPassengers1(driver: Driver): Set<Passenger> =
    trips
        .filter { trip -> trip.driver == driver }
        .flatMap(Trip::passengers)
        .groupBy { passenger -> passenger }
        .filterValues { group -> group.size > 1}
        .keys

fun TaxiPark.findFrequentPassengers2(driver: Driver): Set<Passenger> =
    allPassengers
        .filter { p ->
            trips.count { it.driver == driver && p in it.passengers } > 1
        }
        .toSet()

fun TaxiPark.findSmartPassengers1(): Set<Passenger> {
    val (tripsWithDiscount, tripsWithoutDiscount) =
        trips.partition { it.discount != null }
    return allPassengers
        .filter { passenger ->
            tripsWithDiscount.count { passenger in it.passengers } >
                    tripsWithoutDiscount.count { passenger in it.passengers }
        }
        .toSet()
}

fun TaxiPark.findSmartPassengers2(): Set<Passenger> =
    allPassengers.filter { p ->
        val withDiscount = trips.count { t -> p in t.passengers && t.discount != null }
        val withoutDiscount = trips.count { t -> p in t.passengers && t.discount == null }
        withDiscount > withoutDiscount
    }.toSet()

fun TaxiPark.findTheMostFrequentTripDurationPeriod(): IntRange? {
    return trips
        .groupBy {
            val start = it.duration / 10 * 10
            val end = start + 9
            start..end
        }
        .maxBy { (_, group) -> group.size }
        ?.key
}

fun TaxiPark.checkParetoPrinciple(): Boolean {
    if (trips.isEmpty()) return false

    val totalIncome = trips.sumByDouble(Trip::cost)

    val sortedDriversIncome: List<Double> = trips
        .groupBy(Trip::driver)
        .map { (_, tripsByDriver) -> tripsByDriver.sumByDouble(Trip::cost) }
        .sortedDescending()

    val numberOfTopDrivers = (0.2 * allDrivers.size).toInt()
    val incomeByTopDrivers = sortedDriversIncome
        .take(numberOfTopDrivers)
        .sum()

    return incomeByTopDrivers >= 0.8 * totalIncome
}






fun main() {

}