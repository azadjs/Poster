package az.siftoshka.habitube.model.interactor;

import javax.inject.Inject;

import az.siftoshka.habitube.entities.movielite.MovieResponse;
import az.siftoshka.habitube.model.repository.RemoteExploreRepository;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RemoteExploreInteractor {

    private final RemoteExploreRepository repository;

    @Inject
    public RemoteExploreInteractor(RemoteExploreRepository repository) {
        this.repository = repository;
    }

    public Single<MovieResponse> getUpcomingMovies(String language) {
        return repository.getUpcomingMovies(language)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<MovieResponse> getMovies(String language) {
        return repository.getMovies(language)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<MovieResponse> getTVShows(String language) {
        return repository.getTVShows(language)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<MovieResponse> getAirTodayShows(String language) {
        return repository.getAirTodayShows(language)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<MovieResponse> getSearchResults(String queryName, String language, boolean isAdult) {
        return repository.getSearchResults(queryName, language, isAdult)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<MovieResponse> getMovieSearchResults(String queryName, String language, boolean isAdult) {
        return repository.getMovieSearchResults(queryName, language, isAdult)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<MovieResponse> getShowSearchResults(String queryName, String language, boolean isAdult) {
        return repository.getShowSearchResults(queryName, language, isAdult)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<MovieResponse> getPersonSearchResults(String queryName, String language, boolean isAdult) {
        return repository.getPersonSearchResults(queryName, language, isAdult)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<MovieResponse> discoverMovies(String language, String sortSelection, boolean isAdult, String yearIndex, int voteIndex) {
        return repository.getDiscoveredMovies(language, sortSelection, isAdult, yearIndex, voteIndex);
    }
}
