package com.app.application.ports.input;

import com.app.application.ports.output.RouterViewOutputPort;
import com.app.application.usecases.RouterViewUseCase;
import com.app.domain.Router;

import java.util.List;
import java.util.function.Predicate;

public class RouterViewInputPort implements RouterViewUseCase {

    private final RouterViewOutputPort routerViewOutputPort;

    public RouterViewInputPort(RouterViewOutputPort routerViewOutputPort){
        this.routerViewOutputPort = routerViewOutputPort;
    }

    @Override
    public List<Router> getRouters(Predicate<Router> predicate) {

        var routers = routerViewOutputPort.fetchRouters();

        return Router.retrieveRouter(routers, predicate);
    }
}
