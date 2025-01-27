package com.example.SpringClase2Ejericicio2.Controller;

import com.example.SpringClase2Ejericicio2.Model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class ProductoController {
    @GetMapping("/api/producto")
    @ResponseBody
    public Producto obtenerProducto() {
        return new Producto("Laptop", 1500.99, "Una laptop potente para desarrollo.");
    }
}
