package matste.kotlin.demo

class LocationBean {
    var latitude: Double = .0
    var longitude: Double = .0
}

class ImmutableLocation constructor(
    val latitude: Double,
    val longitude: Double
) {
    //...
}
