
package com.exemplo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiService {

    private final String chave;

    public ApiService(@Value("${api.chave:chave-padrao-123}") String chave) {
        this.chave = chave;
    }

    public void chamarApi() {
        System.out.println("Chamando API com chave: " + chave);
    }
}
