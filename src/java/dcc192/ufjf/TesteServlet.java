package dcc192.ufjf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TesteServlet", urlPatterns = {"/teste.html","/teste2.html"})
public class TesteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = "Detalhes de " + request.getParameter("nome");
        Integer idade;
        try{
        idade = Integer.parseInt(request.getParameter("idade"));
        }catch(Exception e){
            idade = 0;
        }
        
        if(nome == null || nome.isEmpty()){
            nome = "Desconhecido";
        }
        
        request.setAttribute("nome", nome);
        request.setAttribute("idade", idade);
        
        
        if("/teste2.html".equals(request.getServletPath())){
            List<Integer> numeros = new ArrayList();
            Random r = new Random();
            for(int i = 0; i<10; i++){
                numeros.add(r.nextInt(100) + 1);
            }
            request.setAttribute("numeros", numeros);
        }
        
        RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/teste.jsp");
        dispachante.forward(request, response);
    }
    
    
}
