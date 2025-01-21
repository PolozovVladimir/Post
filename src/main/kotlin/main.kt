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
    val file: File = File(),
    val audio: Audio = Audio(),
    val sticker: Sticker = Sticker(),
    val photo: Photo = Photo(),
    val video: Video = Video(),

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

class WallService {
    private var posts = emptyArray<Post>()
    private var id = 0L


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