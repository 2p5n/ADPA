package json_case_class

case class Keyword(
                   id: Int,
                   name: String
                   )
object Keyword {
  implicit val genreReads: Reads[Keyword] = Json.reads[Keyword]
}
