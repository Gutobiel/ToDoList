package br.com.gutobiel.todolist.filter;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                //Pegar a autenticação (usuario e senha)
                var authorization = request.getHeader("Authorization");
                
                var user_password = authorization.substring("Basic".length()).trim();

                System.out.println("Authorization");
                System.out.println(user_password);

                //Validar usuario

                //Validar senha

                //Segue viagem

                filterChain.doFilter(request, response);
    }
}
