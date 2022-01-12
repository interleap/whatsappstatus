package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LastSeenTest {
    @Test
    fun showOnlineStatusForLastSeenDurationOfZeroSeconds() {
        assertEquals("Online", lastSeen(0))
    }

    @Test
    fun showLastSeenStatusForOneSecond(){
        assertEquals("Last seen 1 second ago", lastSeen(1))
    }

    @Test
    fun showLastSeenStatusForMultipleSeconds(){
        val expected = "Last seen 59 seconds ago"
        val actual = lastSeen(59)

        assertEquals(expected, actual)
    }

    @Test
    fun showLastSeenStatusForOneMinute(){
        assertEquals("Last seen 1 minute ago", lastSeen(60))
    }

    @Test
    fun lastSeenShouldRoundDownTheNumberOfMinutes(){
        assertEquals("Last seen 1 minute ago", lastSeen(119))
    }

    @Test
    fun showMinutesInPluralForLastSeenMultipleMinutesAgo(){
        assertEquals("Last seen 50 minutes ago", lastSeen(50 * 60 + 10))
    }
}