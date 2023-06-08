import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.text.similarity.CosineSimilarity;
import org.apache.commons.text.similarity.CosineSimilarityResult;
import org.apache.commons.text.similarity.CosineSimilarityScore;

public class MovieRecommendation {

    public static void main(String[] args) {
        // Sample movie data (title, genre, and plot description)
        List<Movie> movieData = new ArrayList<>(Arrays.asList(
                new Movie("Movie A", "Action", "Plot of Movie A"),
                new Movie("Movie B", "Comedy", "Plot of Movie B"),
                new Movie("Movie C", "Action", "Plot of Movie C"),
                new Movie("Movie D", "Drama", "Plot of Movie D")
                // Add more movies here...
        ));

        // Example input movies
        List<Movie> inputMovies = new ArrayList<>(Arrays.asList(
                new Movie("Movie X", "Action", "Plot of Movie X"),
                new Movie("Movie Y", "Comedy", "Plot of Movie Y")
        ));

        // Append input movies to the movie data list
        movieData.addAll(inputMovies);

        // Calculate similarity scores
        double[][] similarityMatrix = calculateSimilarityMatrix(movieData);

        // Get the index of the last input movie(s)
        int lastMovieIndex = movieData.size() - inputMovies.size();

        // Get the similarity scores of the last input movie(s) with all other movies
        double[] similarityScores = similarityMatrix[lastMovieIndex];

        // Get the indices of the movies with the highest similarity scores
        int[] similarMovieIndices = getTopIndices(similarityScores, inputMovies.size(), 5);

        // Print recommendations
        for (int i = 0; i < inputMovies.size(); i++) {
            Movie movie = inputMovies.get(i);
            System.out.println("Similar movies for '" + movie.getTitle() + "':");
            for (int index : similarMovieIndices) {
                System.out.println(movieData.get(index).getTitle());
            }
            System.out.println();
        }
    }

    private static double[][] calculateSimilarityMatrix(List<Movie> movies) {
        int numMovies = movies.size();
        double[][] similarityMatrix = new double[numMovies][numMovies];

        CosineSimilarity cosineSimilarity = new CosineSimilarity();
        for (int i = 0; i < numMovies; i++) {
            for (int j = 0; j < numMovies; j++) {
                if (i == j) {
                    similarityMatrix[i][j] = 1.0;
                } else {
                    CosineSimilarityResult similarityResult = cosineSimilarity.cosineSimilarity(
                            movies.get(i).getPlot(), movies.get(j).getPlot());
                    similarityMatrix[i][j] = similarityResult.getScore(CosineSimilarityScore.NORMALIZED);
                }
            }
        }

        return similarityMatrix;
    }

    private static int[] getTopIndices(double[] array, int startIndex, int count) {
        int[] indices = new int[count];
        double[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);

        for (int i = 0; i < count; i++) {
            double score = copyArray[array.length - 1 - i];
            for (int j = startIndex; j < array.length; j++) {
                if (array[j] == score) {
                    indices[i] = j;
                    break;
                }
            }
        }

    }

}



