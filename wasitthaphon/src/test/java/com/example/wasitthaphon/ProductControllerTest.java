package com.example.wasitthaphon;

import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.ProductList;
import com.example.wasitthaphon.repositories.FeatureRepository;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private FeatureRepository featureRepository;

    public List<Product> setProducts() {
        List<Product> products = new ArrayList<Product>();
        Product product1 = new Product();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = new Date();

        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        Feature feature = new Feature();
        Feature feature2 = new Feature();
        Feature feature3 = new Feature();
        Feature feature4 = new Feature();
        Feature feature5 = new Feature();
        Feature feature6 = new Feature();
        Feature feature7 = new Feature();

        List<Feature> features1 = new ArrayList<Feature>();
        List<Feature> features2 = new ArrayList<Feature>();
        List<Feature> features3 = new ArrayList<Feature>();
        List<Feature> features4 = new ArrayList<Feature>();
        List<Feature> features5 = new ArrayList<Feature>();

        product1.setProductId(1);
        product1.setStoreId(1);
        product1.setTitle("Adidas NMD R1 Pimeknit Core Black / Core Black");
        product1.setPrice(15900.0);
        product1.setHasDiscount(true);
        product1.setDiscount(34);
        product1.setDiscountExpiredDate(formatter.format(date));
        product1.setSellCity("ขอนแก่น");
        product1.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product1.setRating(40.0);
        product1.setReviewerCount(70);

        feature.setFeatureId(1);
        feature.setProductId(1);
        feature.setName("Size");
        feature.setIsRequired(true);
        feature.setOptions("Size,EU:40");

        feature2.setFeatureId(2);
        feature2.setProductId(1);
        feature2.setName("Color");
        feature2.setIsRequired(true);
        feature2.setOptions("Color,Green,Black");

        features1.add(feature);
        features1.add(feature2);
        product1.setFeatures(features1);
        products.add(product1);

        product2.setProductId(2);
        product2.setStoreId(2);
        product2.setTitle("Biggy Adidas NMD Normal Green");
        product2.setPrice(15900.0);
        product2.setHasDiscount(true);
        product2.setDiscount(34);
        product2.setDiscountExpiredDate(formatter.format(date));
        product2.setSellCity("ขอนแก่น");
        product2.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product2.setRating(40.0);
        product2.setReviewerCount(70);

        feature3.setFeatureId(3);
        feature3.setProductId(2);
        feature3.setName("Size");
        feature3.setIsRequired(true);
        feature3.setOptions("Size,EU:33");

        feature4.setFeatureId(4);
        feature4.setProductId(2);
        feature4.setName("Size");
        feature4.setIsRequired(true);
        feature4.setOptions("Size,EU:35");

        features2.add(feature3);
        features2.add(feature4);
        product2.setFeatures(features2);
        products.add(product2);

        product3.setProductId(3);
        product3.setStoreId(3);
        product3.setTitle("Black Friday hwak Adidas NMD");
        product3.setPrice(15900.0);
        product3.setHasDiscount(true);
        product3.setDiscount(34);
        product3.setDiscountExpiredDate(formatter.format(date));
        product3.setSellCity("ขอนแก่น");
        product3.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product3.setRating(40.0);
        product3.setReviewerCount(70);

        feature5.setFeatureId(5);
        feature5.setProductId(3);
        feature5.setName("Size");
        feature5.setIsRequired(true);
        feature5.setOptions("Size,EU:40");

        features3.add(feature5);
        product3.setFeatures(features3);

        products.add(product3);

        product4.setProductId(4);
        product4.setStoreId(4);
        product4.setTitle("Frame base blue Adidas NMD  peach");
        product4.setPrice(15900.0);
        product4.setHasDiscount(true);
        product4.setDiscount(34);
        product4.setDiscountExpiredDate(formatter.format(date));
        product4.setSellCity("ขอนแก่น");
        product4.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product4.setRating(40.0);
        product4.setReviewerCount(70);

        feature6.setFeatureId(6);
        feature6.setProductId(4);
        feature6.setName("Size");
        feature6.setIsRequired(true);
        feature6.setOptions("Size,EU:40");

        features4.add(feature6);
        product4.setFeatures(features4);

        products.add(product4);

        product5.setProductId(5);
        product5.setStoreId(5);
        product5.setTitle("Adidas NMD jagged move");
        product5.setPrice(15900.0);
        product5.setHasDiscount(true);
        product5.setDiscount(34);
        product5.setDiscountExpiredDate(formatter.format(date));
        product5.setSellCity("ขอนแก่น");
        product5.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product5.setRating(40.0);
        product5.setReviewerCount(70);

        feature7.setFeatureId(7);
        feature7.setProductId(5);
        feature7.setName("Size");
        feature7.setIsRequired(true);
        feature7.setOptions("Size,EU:40");

        features5.add(feature7);
        product5.setFeatures(features5);

        products.add(product5);

        return products;
    }

    @Test
    void Get_Product_Title_Contains_Limit5_Success() {
        // Arrange
        int pageSize = 5;
        Pageable pageable = PageRequest.of(0, pageSize);
        List<Product> products = setProducts();

        when(productRepository.findByTitleContains("Adidas NMD", pageable)).thenReturn(Optional.of(products));

        // Act
        ProductList response = testRestTemplate.getForObject(
                "/products?search_query=Adidas NMD&limit=" + pageSize, ProductList.class);

        // Assert
        Assertions.assertEquals(5, response.getProducts().size());
        for (int i = 0; i < response.getProducts().size(); i++) {
            Assertions.assertTrue(response.getProducts().get(i).getTitle().indexOf("Adidas NMD") > -1 ? true : false);
        }
    }

    @Test
    void Get_Product_Id_4_Success() {
        // Arrange
        int KEY = 4;
        List<Product> products = setProducts();
        Product product = new Product();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == KEY) {
                product = products.get(i);
            }
        }

        when(productRepository.findById(4)).thenReturn(Optional.of(product));

        // Act
        Product result = testRestTemplate.getForObject(
                "/products/" + KEY, Product.class);

        // Assert
        Assertions.assertEquals(4, result.getProductId());
    }
}
