package com.app.framework.adapters.input.stdin;

import com.app.application.ports.input.RouterViewInputPort;
import com.app.application.usecases.RouterViewUseCase;
import com.app.domain.Router;
import com.app.domain.RouterType;
import com.app.framework.adapters.output.file.RouterViewFileAdapter;

import java.util.List;

public class RouterViewCLIAdapter {

    private RouterViewUseCase routerViewUseCase;

    public RouterViewCLIAdapter(){
        setAdapters();
    }

    public List<Router> obtainRelatedRouters(String type){
        return routerViewUseCase.getRouters(Router.filterRouterByType(RouterType.valueOf(type)));
    }

    private void setAdapters(){
        this.routerViewUseCase = new RouterViewInputPort(RouterViewFileAdapter.getInstance());
    }
}
