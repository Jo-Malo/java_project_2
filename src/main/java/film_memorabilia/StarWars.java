package film_memorabilia;

public class StarWars extends Item{
    private String film;

    public StarWars(int buyPrice, int shipping, int marketValue) {
        super(buyPrice, shipping, marketValue);
            this.film = film;
        }

        public String getFilm() {
            return this.film;
        }
}
