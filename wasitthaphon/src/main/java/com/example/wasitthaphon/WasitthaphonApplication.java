package com.example.wasitthaphon;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.repositories.FeatureRepository;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WasitthaphonApplication {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private FeatureRepository featureRepository;

	@PostConstruct
	public void InitialProducts() {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();

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

		productRepository.save(product1);

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

		productRepository.save(product2);

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

		productRepository.save(product3);

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

		productRepository.save(product4);

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

		productRepository.save(product5);

		product6.setProductId(6);
		product6.setStoreId(6);
		product6.setTitle("Hexa mana sand Adidas NMD");
		product6.setPrice(15900.0);
		product6.setHasDiscount(true);
		product6.setDiscount(34);
		product6.setDiscountExpiredDate(formatter.format(date));
		product6.setSellCity("ขอนแก่น");
		product6.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
		product6.setRating(40.0);
		product6.setReviewerCount(70);

		productRepository.save(product6);

	}

	@PostConstruct
	public void InitialFeatures() {
		Feature feature = new Feature();
		Feature feature2 = new Feature();
		Feature feature3 = new Feature();
		Feature feature4 = new Feature();
		Feature feature5 = new Feature();
		Feature feature6 = new Feature();
		Feature feature7 = new Feature();
		Feature feature8 = new Feature();

		feature.setFeatureId(1);
		feature.setProductId(1);
		feature.setName("Size");
		feature.setIsRequired(true);
		feature.setOptions("Size,EU:40");

		featureRepository.save(feature);

		feature2.setFeatureId(2);
		feature2.setProductId(1);
		feature2.setName("Color");
		feature2.setIsRequired(true);
		feature2.setOptions("Color,Green,Black");

		featureRepository.save(feature2);

		feature3.setFeatureId(3);
		feature3.setProductId(2);
		feature3.setName("Size");
		feature3.setIsRequired(true);
		feature3.setOptions("Size,EU:33");

		featureRepository.save(feature3);

		feature4.setFeatureId(4);
		feature4.setProductId(2);
		feature4.setName("Size");
		feature4.setIsRequired(true);
		feature4.setOptions("Size,EU:35");

		featureRepository.save(feature4);

		feature5.setFeatureId(5);
		feature5.setProductId(3);
		feature5.setName("Size");
		feature5.setIsRequired(true);
		feature5.setOptions("Size,EU:40");

		featureRepository.save(feature5);

		feature6.setFeatureId(6);
		feature6.setProductId(4);
		feature6.setName("Size");
		feature6.setIsRequired(true);
		feature6.setOptions("Size,EU:40");

		featureRepository.save(feature6);

		feature7.setFeatureId(7);
		feature7.setProductId(5);
		feature7.setName("Size");
		feature7.setIsRequired(true);
		feature7.setOptions("Size,EU:40");

		featureRepository.save(feature7);

		feature8.setFeatureId(8);
		feature8.setProductId(6);
		feature8.setName("Size");
		feature8.setIsRequired(true);
		feature8.setOptions("Size,EU:40");

		featureRepository.save(feature8);
	}

	public static void main(String[] args) {
		SpringApplication.run(WasitthaphonApplication.class, args);
	}

}
