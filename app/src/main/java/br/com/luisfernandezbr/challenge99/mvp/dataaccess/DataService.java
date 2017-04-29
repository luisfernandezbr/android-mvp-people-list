package br.com.luisfernandezbr.challenge99.mvp.dataaccess;


import java.io.IOException;
import java.util.List;

import br.com.luisfernandezbr.challenge99.pojo.TechStar;

interface DataService {

    List<TechStar> loadList() throws IOException;
}
