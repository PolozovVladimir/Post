import java.util.Objects

data class Post(
    val id: Int,
    val owerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val data: Long,
    val text: String,
    val replyOwerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
)
object Comments{
    val count: Int = 1
    val canPost: Boolean = true
    val groupCanPost: Boolean = true
    val canClose: Boolean = true
    val canOpen: Boolean = true
}

object WallService {
    fun add (post: Post):Post{
        return post
    }
}






fun main(){

}