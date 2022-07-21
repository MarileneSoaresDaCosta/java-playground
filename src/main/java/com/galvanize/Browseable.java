package com.galvanize;

import java.net.URI;
import java.net.URISyntaxException;

public interface Browseable {
    public void visit(URI uri);

    public URI getCurrentPage() throws URISyntaxException;
}
