package com.example.moviecatalogue.model;

import com.example.moviecatalogue.R;

import java.util.ArrayList;

public class MovieData {
    private static String[] movieNames = {
            "Avengers: Infinity War",
            "Bohemian Rhapsody",
            "Deadpool 2",
            "Bumblebee",
            "A Star Is Born",
            "Aquaman",
            "Venom",
            "Spider-Man: Into the Spider-Verse",
            "Black Panther",
            "Mission: Impossible - Fallout"
    };

    private static String[] movieReleaseDate = {
            "April 25, 2018",
            "October 24, 2018",
            "May 10, 2018",
            "December 15, 2018",
            "October 3, 2018",
            "December 7, 2018",
            "September 28, 2018",
            "December 6, 2018",
            "February 13, 2018",
            "July 13, 2018"
    };

    private static String[] movieDescriptions = {
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.",
            "When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfill his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe."
    };

    private static int[] movieImages = {
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_bohemian,
            R.drawable.poster_deadpool,
            R.drawable.poster_bumblebee,
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_venom,
            R.drawable.poster_spiderman,
            R.drawable.poster_black_panther,
            R.drawable.poster_mission
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for(int pos = 0; pos < movieNames.length; pos++) {
            Movie movie = new Movie();
            movie.setName(movieNames[pos]);
            movie.setRelease(movieReleaseDate[pos]);
            movie.setDescription(movieDescriptions[pos]);
            movie.setPhoto(movieImages[pos]);
            list.add(movie);
        }

        return list;
    }
}
