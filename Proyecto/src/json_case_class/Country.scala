package json_case_class

case class Country(
                                  iso_3166_1: String,
                                  name: String
                                  )
object Country {
  implicit val countryReads: Reads[Country] = Json.reads[Country]
}