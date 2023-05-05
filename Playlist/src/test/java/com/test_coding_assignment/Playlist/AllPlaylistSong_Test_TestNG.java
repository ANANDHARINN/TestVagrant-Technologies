package com.test_coding_assignment.Playlist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllPlaylistSong_Test_TestNG /* extends AllPlaylistSong_Test */ {

//	public AllPlaylistSong_Test_TestNG(int space) {
//		super(space);
//		// TODO Auto-generated constructor stub
//	}

	@Test
	public void testAddSong() {
		AllPlaylistSong_Test playlist = new AllPlaylistSong_Test(5);
		playlist.addSong("Song 1");
		playlist.addSong("Song 2");
		playlist.addSong("Song 3");
		playlist.displayPlaylist();
		Assert.assertEquals(playlist.displayPlaylist(), "Currentsong playing: song 1, song 2 and Song 3 ");
	}

	@Test
	public void testRemoveSong() {
		AllPlaylistSong_Test playlist = new AllPlaylistSong_Test(5);
		playlist.addSong("Song 1");
		playlist.addSong("Song 2");
		playlist.addSong("Song 3");
		playlist.removeSong("Song 2");
		Assert.assertEquals(playlist.displayPlaylist(), "Current song playing: Song 1 & Song 3");
	}

	@Test
	public void testDisplayPlaylist() {
		AllPlaylistSong_Test playlist = new AllPlaylistSong_Test(5);
		playlist.addSong("Song 1");
		playlist.addSong("Song 2");
		playlist.addSong("Song 3");
		Assert.assertEquals(playlist.displayPlaylist(), "Current song playing: song 1, song 2 & song 3");
	}
}

/*
 * public class Main { public static void main(String[] args) { Playlist
 * playlist = new Playlist(3);
 * 
 * playlist.addSong("S1"); playlist.addSong("S2"); playlist.addSong("S3");
 * 
 * playlist.displayPlaylist(); // Current playlist: S1 S2 S3
 * 
 * playlist.addSong("S4");
 * 
 * playlist.displayPlaylist(); // Current playlist: S2 S3 S4
 * 
 * playlist.addSong("S2");
 * 
 * playlist.displayPlaylist(); // Current playlist: S3 S4 S2
 * 
 * playlist.addSong("S1");
 * 
 * playlist.displayPlaylist(); // Current playlist: S4 S2 S1
 * 
 * playlist.removeSong("S2");
 * 
 * playlist.displayPlaylist(); // Current playlist: S4 S1 } }
 * 
 * 
 */