package com.app.application.usecases;

import com.app.domain.Router;

import java.util.List;
import java.util.function.Predicate;

public interface RouterViewUseCase {

    List<Router> getRouters(Predicate<Router> predicate);


}
