package d8p8_Alternative;

class Comic {
    String title;
    String issueNumber;
    /* condition is Condition type, not String type.  */
    Condition condition;
    float basePrice;
    float price;

    Comic(String inTitle, String inIssueNumber, Condition inCondition,
        float inBasePrice) {

        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}

