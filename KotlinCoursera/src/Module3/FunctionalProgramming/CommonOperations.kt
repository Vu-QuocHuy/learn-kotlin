package Module3.FunctionalProgramming

data class Hero(
    val name: String,
    val age: Int,
    val gender: Gender?
)
enum class Gender {MALE, FEMALE}

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE),

    )

    println(heroes.firstOrNull {it.age == 30}?.name)
    println(heroes.map { it.age }.distinct().size)
    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println(oldest.size)
    println(heroes.maxBy { it.age }?.name)
    println(heroes.all { it.age < 50 })
    val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!
    println(age)

//    val mapByName: Map<String, Hero> =
//        heroes.associateBy { it.name }
//    mapByName["Frenchy"]?.age
//
//    val mapByName = heroes.associateBy { it.name }
//    val unknownHero = Hero("Unknown", 0, null)
//    mapByName.getOrElse("unknown") { unknownHero }.age

    val (first, second) = heroes
        .flatMap { heroes.map { hero -> it to hero } }
        .maxBy { it.first.age - it.second.age }!!
    println(first.name)
}