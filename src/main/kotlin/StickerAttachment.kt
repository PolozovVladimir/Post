data class StickerAttachment (
    val sticker: Sticker = Sticker()
): Attachment {
    override val type: String = "sticker"
}