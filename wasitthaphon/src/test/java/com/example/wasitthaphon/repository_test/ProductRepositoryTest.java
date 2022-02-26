package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.FeatureOption;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.ProductImage;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> generateProducts() {
        List<Product> products = new ArrayList<Product>();
        Product product1 = new Product();
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

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        product1.setId(1);
        product1.setStoreId(1);
        product1.setTitle("Adidas NMD R1 Pimeknit Core Black / Core Black");
        product1.setPrice(15900.0);
        product1.setHasDiscount(true);
        product1.setDiscount(34);
        product1.setOnhandQuantity(5);
        product1.setDiscountExpiredDate(formatter.format(date));
        product1.setSellCity("ขอนแก่น");
        product1.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product1.setRating(40.0);
        product1.setReviewerCount(70);

        product2.setId(2);
        product2.setStoreId(2);
        product2.setTitle("Biggy Adidas NMD Normal Green");
        product2.setPrice(15900.0);
        product2.setOnhandQuantity(5);
        product2.setHasDiscount(true);
        product2.setDiscount(34);
        product2.setDiscountExpiredDate(formatter.format(date));
        product2.setSellCity("ขอนแก่น");
        product2.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product2.setRating(40.0);
        product2.setReviewerCount(70);

        product3.setId(3);
        product3.setStoreId(3);
        product3.setTitle("Black Friday hwak Adidas NMD");
        product3.setPrice(15900.0);
        product3.setOnhandQuantity(5);
        product3.setHasDiscount(true);
        product3.setDiscount(34);
        product3.setDiscountExpiredDate(formatter.format(date));
        product3.setSellCity("ขอนแก่น");
        product3.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product3.setRating(40.0);
        product3.setReviewerCount(70);

        product4.setId(4);
        product4.setStoreId(4);
        product4.setTitle("Frame base blue Adidas NMD  peach");
        product4.setPrice(15900.0);
        product4.setOnhandQuantity(5);
        product4.setHasDiscount(true);
        product4.setDiscount(34);
        product4.setDiscountExpiredDate(formatter.format(date));
        product4.setSellCity("ขอนแก่น");
        product4.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product4.setRating(40.0);
        product4.setReviewerCount(70);

        product5.setId(5);
        product5.setStoreId(5);
        product5.setTitle("Adidas NMD jagged move");
        product5.setPrice(15900.0);
        product5.setOnhandQuantity(5);
        product5.setHasDiscount(true);
        product5.setDiscount(34);
        product5.setDiscountExpiredDate(formatter.format(date));
        product5.setSellCity("ขอนแก่น");
        product5.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
        product5.setRating(40.0);
        product5.setReviewerCount(70);

        FeatureOption featureOption1 = new FeatureOption();
        FeatureOption featureOption2 = new FeatureOption();
        FeatureOption featureOption3 = new FeatureOption();
        FeatureOption featureOption4 = new FeatureOption();
        FeatureOption featureOption5 = new FeatureOption();
        FeatureOption featureOption6 = new FeatureOption();
        FeatureOption featureOption7 = new FeatureOption();
        FeatureOption featureOption8 = new FeatureOption();
        FeatureOption featureOption9 = new FeatureOption();
        FeatureOption featureOption10 = new FeatureOption();
        FeatureOption featureOption11 = new FeatureOption();
        FeatureOption featureOption12 = new FeatureOption();
        FeatureOption featureOption13 = new FeatureOption();
        FeatureOption featureOption14 = new FeatureOption();
        FeatureOption featureOption15 = new FeatureOption();

        ProductImage productImage1 = new ProductImage();
        ProductImage productImage2 = new ProductImage();
        ProductImage productImage3 = new ProductImage();
        ProductImage productImage4 = new ProductImage();
        ProductImage productImage5 = new ProductImage();

        List<FeatureOption> featureOptions1List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions2List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions3List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions4List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions5List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions6List = new ArrayList<FeatureOption>();
        List<FeatureOption> featureOptions7List = new ArrayList<FeatureOption>();

        List<ProductImage> productImages1 = new ArrayList<ProductImage>();
        List<ProductImage> productImages2 = new ArrayList<ProductImage>();
        List<ProductImage> productImages3 = new ArrayList<ProductImage>();
        List<ProductImage> productImages4 = new ArrayList<ProductImage>();
        List<ProductImage> productImages5 = new ArrayList<ProductImage>();

        feature.setId(1);
        feature.setProduct(product1);
        feature.setName("Size");
        feature.setIsRequired(true);

        featureOption1.setFeature(feature);
        featureOption1.setFeatureOptionId(1);
        featureOption1.setOption("Size");
        featureOptions1List.add(featureOption1);
        featureOption2.setFeature(feature);
        featureOption2.setFeatureOptionId(2);
        featureOption2.setOption("EU:40");
        featureOptions1List.add(featureOption2);
        feature.setFeatureOptions(featureOptions1List);

        feature2.setId(2);
        feature2.setProduct(product1);
        feature2.setName("Color");
        feature2.setIsRequired(true);

        featureOption3.setFeature(feature2);
        featureOption3.setFeatureOptionId(3);
        featureOption3.setOption("Color");
        featureOptions2List.add(featureOption3);
        featureOption4.setFeature(feature2);
        featureOption4.setFeatureOptionId(4);
        featureOption4.setOption("Green");
        featureOptions2List.add(featureOption4);
        featureOption5.setFeature(feature2);
        featureOption5.setFeatureOptionId(5);
        featureOption5.setOption("Black");
        featureOptions2List.add(featureOption4);
        feature2.setFeatureOptions(featureOptions2List);

        productImage1.setId(1);
        productImage1.setProduct(product1);
        productImage1.setProductImageUrl("https://www.google.com");
        productImages1.add(productImage1);
        product1.setProductImages(productImages1);

        feature3.setId(3);
        feature3.setProduct(product2);
        feature3.setName("Size");
        feature3.setIsRequired(true);

        featureOption6.setFeature(feature3);
        featureOption6.setFeatureOptionId(6);
        featureOption6.setOption("Size");
        featureOptions3List.add(featureOption6);
        featureOption7.setFeature(feature3);
        featureOption7.setFeatureOptionId(7);
        featureOption7.setOption("EU:33");
        featureOptions3List.add(featureOption7);
        feature3.setFeatureOptions(featureOptions3List);

        feature4.setId(4);
        feature4.setProduct(product2);
        feature4.setName("Size");
        feature4.setIsRequired(true);

        featureOption8.setFeature(feature4);
        featureOption8.setFeatureOptionId(8);
        featureOption8.setOption("Size");
        featureOptions4List.add(featureOption8);
        featureOption9.setFeature(feature4);
        featureOption9.setFeatureOptionId(9);
        featureOption9.setOption("EU:35");
        featureOptions4List.add(featureOption9);
        feature4.setFeatureOptions(featureOptions4List);

        productImage2.setId(2);
        productImage2.setProduct(product2);
        productImage2.setProductImageUrl("https://www.facebook.com");
        productImages2.add(productImage2);
        product2.setProductImages(productImages2);

        feature5.setId(5);
        feature5.setProduct(product3);
        feature5.setName("Size");
        feature5.setIsRequired(true);

        featureOption10.setFeature(feature5);
        featureOption10.setFeatureOptionId(10);
        featureOption10.setOption("Size");
        featureOptions5List.add(featureOption10);
        featureOption11.setFeature(feature5);
        featureOption11.setFeatureOptionId(11);
        featureOption11.setOption("EU:40");
        featureOptions5List.add(featureOption11);
        feature5.setFeatureOptions(featureOptions5List);

        productImage3.setId(3);
        productImage3.setProduct(product3);
        productImage3.setProductImageUrl("http://www.localhost.com");
        productImages3.add(productImage3);
        product3.setProductImages(productImages3);

        feature6.setId(6);
        feature6.setProduct(product4);
        feature6.setName("Size");
        feature6.setIsRequired(true);

        featureOption12.setFeature(feature6);
        featureOption12.setFeatureOptionId(12);
        featureOption12.setOption("Size");
        featureOptions6List.add(featureOption12);
        featureOption13.setFeature(feature6);
        featureOption13.setFeatureOptionId(13);
        featureOption13.setOption("EU:40");
        featureOptions6List.add(featureOption13);
        feature6.setFeatureOptions(featureOptions6List);

        productImage4.setId(4);
        productImage4.setProduct(product4);
        productImage4.setProductImageUrl("http://www.google.com/1");
        productImages4.add(productImage4);
        product4.setProductImages(productImages4);

        feature7.setId(7);
        feature7.setProduct(product5);
        feature7.setName("Size");
        feature7.setIsRequired(true);

        featureOption14.setFeature(feature6);
        featureOption14.setFeatureOptionId(14);
        featureOption14.setOption("Size");
        featureOptions7List.add(featureOption14);
        featureOption15.setFeature(feature6);
        featureOption15.setFeatureOptionId(15);
        featureOption15.setOption("EU:40");
        featureOptions7List.add(featureOption15);
        feature7.setFeatureOptions(featureOptions7List);

        productImage5.setId(5);
        productImage5.setProduct(product5);
        productImage5.setProductImageUrl("www.google.com");
        productImages5.add(productImage5);
        product5.setProductImages(productImages5);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        return products;
    }

    @Test
    void Find_By_Title_Contains_Success() {

        // Arrange
        final String NAME_CONTAINS_KEY = "Adidas NMD";
        final String NAME_CONTAINS_RESULT = "Adidas NMD";
        List<Product> products = generateProducts();
        productRepository.saveAll(products);
        Pageable pageable = PageRequest.of(0, 5);

        // Act
        Optional<List<Product>> result = productRepository.findByTitleContains(NAME_CONTAINS_KEY, pageable);

        // Assert
        assertTrue(result.get().size() > 0);

        result.get().forEach(item -> {
            assertTrue(item.getTitle().indexOf(NAME_CONTAINS_RESULT) > -1);
        });
    }

    @Test
    void Find_By_Id_Success() {

        // Arrange
        List<Product> products = generateProducts();
        productRepository.saveAll(products);

        // Act
        Optional<Product> result = productRepository.findById(4);

        // Assert
        assertEquals(4, result.get().getId());

    }
}
