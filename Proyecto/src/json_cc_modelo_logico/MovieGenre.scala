package json_cc_modelo_logico

case class MovieGenre(
                       movieId: Int,
                       genreId: Int
                     )

object MovieGenre {
  implicit val movieGenreReads: Reads[MovieGenre] = Json.reads[MovieGenre]
}
