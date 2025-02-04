package json_case_class

case class BelongsToCollection(

                                id: Int,
                                name: String,
                                posterPath: String,
                                backdropPath: String
                              )

// Implementar el `Reads` necesario para Play JSON
object BelongsToCollection {
  implicit val belongsToCollectionReads: Reads[BelongsToCollection] = Json.reads[BelongsToCollection]
}
