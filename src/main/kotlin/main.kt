import WallService.id
import WallService.posts
import java.util.Objects

private val Any.id: Any
    get() {
        TODO("Not yet implemented")
    }

data class Post(
    val id: Long = 1,
    val owerId: Long = 1,
    val fromId: Long = 1,
    val createdBy: Int = 1,
    val data: Long = 1,
    val text: String = "",
    val replyOwerId: Int = 1,
    val replyPostId: Int = 1,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments()
)
data class Comments(
    val count: Int = 1,
    val canPost: Boolean = true,
    val groupCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)

object WallService {
    fun clear() {
        posts = emptyArray()
    }

    var posts = emptyArray<Post>()
        var id = 0L
    }


fun add(post: Post): Post {
    val updated = post.copy(id = ++id)
posts += updated
    return updated
}

fun update(post: Post): Boolean {
    for (i in posts.indices) {
        val current = setOf(post)
        if (current.id == post) {
            posts[i] = post
            return true
        }
    }
    return false
}






fun main(){

}