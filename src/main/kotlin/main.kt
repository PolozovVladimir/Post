@file:Suppress("UNREACHABLE_CODE")

import WallService.id

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