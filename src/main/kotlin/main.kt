@file:Suppress("UNREACHABLE_CODE")

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
    val comments: Comments = Comments(),
    val reposts: Repost? = null,
    val attachment: List<Attachment> = emptyList(),


)
data class Repost(
    val count: Int = 1,
    val userReposted: Boolean = false,
)

data class Comments(
    val count: Int = 1,
    val canPost: Boolean = true,
    val groupCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)

class PostNotFoundException(massage: String) : RuntimeException(massage)



class WallService {
    private var posts = emptyArray<Post>()
    private var id = 0L
    private var comments = emptyArray<Comment>()
    private var lastId = 0

    fun getLastId(): Int {
        return lastId
    }


    fun createComment (postId: Int, comment: Comment): Comment {
        val post = posts.find { it.id.toInt() == postId }
        return if (post != null) {
            val newComment = comment.copy(id = ++lastId)
            comments += newComment
            newComment
        } else {
            throw PostNotFoundException("Post with ID $postId not found")
        }
    }


    fun add(post: Post): Post {
        val updated = post.copy(++id, comments = post.comments.copy())
        posts += updated
        return updated


    }

fun update(post: Post): Boolean {
    for (i in posts.indices) {
        val current = posts[i]
        if (current.id == post.id) {
            posts[i] = post
            return true
        }
    }
    return false
}
}





fun main(){

}