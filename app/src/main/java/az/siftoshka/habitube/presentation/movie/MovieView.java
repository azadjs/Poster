package az.siftoshka.habitube.presentation.movie;

import java.util.List;

import az.siftoshka.habitube.entities.movie.Movie;
import az.siftoshka.habitube.entities.movielite.MovieLite;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface MovieView extends MvpView {
    void showMovie(Movie movie);

    void showSimilarMovieList(List<MovieLite> similarMovies);

    void showProgress(boolean loadingState);

    void showMovieScreen();
    void showErrorScreen();

    void setSaveButtonEnabled(boolean enabled);
}