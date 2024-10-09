package intermediate.enums;

/* enums = enumerated (ordered listing of items in a collection)
 * Enums are a grouping of constants that behave similarly to objects
 * They FINAL by default, so it cannot be changed once its created.*/

public enum Status {
    HTTP_200(200, "HTTP 200 Success"),
    HTTP_201(201, "HTTP 201 Created"),
    HTTP_102(102, "HTTP 102 Processing"),
    HTTP_404(404, "HTTP 404 Not found"),
    HTTP_500(500, "HTTP 500 Internal server error"),
    HTTP_403(403, "HTTP 403 Not allowed");

    int number;
    String message;

    Status(int number, String message) {
        this.number = number;
        this.message = message;
    }
}
