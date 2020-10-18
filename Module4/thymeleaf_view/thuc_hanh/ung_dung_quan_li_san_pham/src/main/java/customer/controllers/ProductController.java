package customer.controllers;

import customer.entity.Product;
import customer.services.ProductService;
import customer.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductServiceImp productService;
    @GetMapping("/")
    public String homeView(Model model, RedirectAttributes redirectAttributes){
        List<Product> productList= productService.findAll();
        model.addAttribute("products", productList);
        redirectAttributes.addFlashAttribute("success", "");
        return "home_product";
    }
    @GetMapping("/product/create")
    public String createProductView(Model model){
        model.addAttribute("newProduct",new Product());
        return "create_product";
    }
    @PostMapping("/product/save")
    public String saveProduct(Product newProduct, RedirectAttributes redirect){
        productService.save(newProduct);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String editProduct(@PathVariable String id,Model model){
        model.addAttribute("productEdit",productService.findById(id));
        return "edit_product";
    }
    @PostMapping("/product/update")
    public String updateProduct(Product editProduct,RedirectAttributes redirect){
        productService.update(editProduct.getId(), editProduct);
        redirect.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/delete")
    public String deleteProduct(@PathVariable String id,Model model){
        model.addAttribute("delProduct", productService.findById(id));
        return "delete_product";
    }
    @PostMapping("/product/delete")
    public String delProduct(Product delProduct,RedirectAttributes redirect){
        productService.remove(delProduct.getId());
        redirect.addFlashAttribute("success", "Delete customer successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String viewProduct(@PathVariable String id, Model model){
        model.addAttribute("viewProduct",productService.findById(id));
        return "view_product";
    }
}
