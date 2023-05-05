package com.test_coding_assignment.Playlist;

public class AllPlaylistSong_Test {

	private String[] songs;
	private int space;
	private int N; // N is total number of Songs

	public AllPlaylistSong_Test(int space) {

		this.space = space;
		songs = new String[space]; // storing capacity or total song in an array

		// initialize N = 0 to make counts of song
		N = 0;
	}

	public void addSong(String song) {
		if (N >= space) {
			System.out.println("Song Occupied in memory is Full");
			return;
		}
		songs[N] = song;
		N++; // increment the count of song
		System.out.println(song + " has been added to the playlist.");
	}

	// below function used to remove song from the play list

	public void removeSong(String song) {

		boolean found = false;

		for (int i = 0; i < N; i++) {
			if (songs[i].equals(song)) {
				found = true;

				for (int j = i; j < N - 1; j++) {
					songs[j] = songs[j + 1];
				}

				N--; // this will decrement and remove the song

				System.out.println(song + " song have been removed from the playlist ");

				break; // breaking the loop iteration as its continues till j<N-1
			}
		}

		if (!found) {

			System.out.println(song + "song is not present in the playlist ");
		}
	}

	// creating another funtion which used to display the song in playilist

	public int displayPlaylist() {

		// handling the edge case

		if (N == 0) {
			System.out.println("Playlist is empty/null");
			return space;
		}

		System.out.print("Current playlist playing: ");
		for (int i = 0; i < N; i++) {
			System.out.print(songs[i] + " ");
		}

		System.out.println("");
		return N;

	}

}
