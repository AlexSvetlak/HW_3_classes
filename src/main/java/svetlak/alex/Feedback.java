package svetlak.alex;

public class Feedback {
    String review;
    int like = 0;
    int dislike = 0;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        if (like >= 0) {
            this.like = like;
        }
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        if (dislike >= 0) {
            this.dislike = dislike;
        }
    }

    public void getScore() {
        int score = getLike() + getDislike();
        System.out.println(score);
    }
}
