package com.galvanize;

import java.net.URI;
import java.net.URISyntaxException;

class Crawler implements Browseable{
    private URI uri;

    @Override
    public void visit(URI uri){
        this.uri = uri;
        getCurrentPage();
    }

    @Override
    public URI getCurrentPage() {
        return this.uri;
    }
}
