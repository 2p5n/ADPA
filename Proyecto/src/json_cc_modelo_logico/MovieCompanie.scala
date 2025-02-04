package json_cc_modelo_logico

case class MovieCompanie(
                          movieId: Int,
                          companyId: Int
                        )

object MovieCompanie {
  implicit val movieCompanieReads: Reads[MovieCompanie] = Json.reads[MovieCompanie]
}
