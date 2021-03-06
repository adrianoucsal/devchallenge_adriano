package com.wexinc.interview.challenge1.util;

import spark.*;

public class Filters {
	// If a user manually manipulates paths and forgets to add
    // a trailing slash, redirect the user to the correct path
    public static Filter addTrailingSlashes = (Request request, Response response) -> {
        if (!request.pathInfo().endsWith("/")) {
            response.redirect(request.pathInfo() + "/");
        }
    };

    // Enable GZIP for all responses
    public static Filter addGzipHeader = (Request request, Response response) -> {
        response.header("Content-Encoding", "gzip");
    };

    
    // All responses are JSON
    public static Filter addJsonContentType = (Request request, Response response) -> {
    	response.header("Content-Type", "application/json");
    };
}
