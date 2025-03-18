package taxipark

/*
 * Task #1. Find all the drivers who performed no trips.
 */
fun TaxiPark.findFakeDrivers(): Set<Driver> =
        allDrivers - trips.map { it.driver }.toSet()

/*
 * Task #2. Find all the clients who completed at least the given number of trips.
 */
fun TaxiPark.findFaithfulPassengers(minTrips: Int): Set<Passenger> =
        allPassengers.filter { p -> trips.count { p in it.passengers} >= minTrips }.toSet()

/*
 * Task #3. Find all the passengers, who were taken by a given driver more than once.
 */
fun TaxiPark.findFrequentPassengers(driver: Driver): Set<Passenger> =
        trips.filter { it.driver == driver }
            .flatMap { it.passengers }
            .groupingBy { it }.eachCount()
            .filterValues { it > 1 }
            .keys

/*
 * Task #4. Find the passengers who had a discount for majority of their trips.
 */
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
        allPassengers.filter { p ->
            val (discounted, nonDiscounted) = trips.filter { p in it.passengers }
                .partition { it.discount != null && it.discount >= 0.0 }
            discounted.size > nonDiscounted.size
        }.toSet()

/*
 * Task #5. Find the most frequent trip duration among minute periods 0..9, 10..19, 20..29, and so on.
 * Return any period if many are the most frequent, return `null` if there're no trips.
 */
fun TaxiPark.findTheMostFrequentTripDurationPeriod(): IntRange? {
    return trips.map { it.duration / 10 * 10..it.duration / 10 * 10 + 9}
        .groupingBy { it }.eachCount()
        .maxByOrNull { it.value }?.key
}

/*
 * Task #6.
 * Check whether 20% of the drivers contribute 80% of the income.
 */
fun TaxiPark.checkParetoPrinciple(): Boolean {
    if (trips.isEmpty()) return false

    val totalIncome = trips.sumOf { it.cost }
    val sortedDrivers = trips.groupBy { it.driver }
        .mapValues { (_, trips) -> trips.sumOf { it.cost } }
        .values.sortedDescending()

    val topDriversCount = (allDrivers.size * 0.2).toInt().coerceAtLeast(1)
    val topIncome = sortedDrivers.take(topDriversCount).sum()

    return topIncome >= 0.8 * totalIncome
}