package org.example

fun lastSeen(duration: Int): String {
    return when (duration) {
        0 -> "Online"
        in 1 until 60  -> "Last seen $duration seconds ago"
        in 1 * 60 until 60 * 60 -> "Last seen ${duration / 60} minutes ago"
        in 60 * 60 until 60 * 60 * 24 -> "Last seen ${duration /(60 * 60)} hours ago"
        else -> "Last seen ${duration /(60 * 60 * 24)} days ago"
    }
}