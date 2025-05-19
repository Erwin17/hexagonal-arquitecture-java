package com.app.application.ports.output;

import com.app.domain.Router;

import java.util.List;

public interface RouterViewOutputPort {

    public List<Router> fetchRouters();
}
