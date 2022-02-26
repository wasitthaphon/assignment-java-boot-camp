package com.example.wasitthaphon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.FeatureOption;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.ProductImage;
import com.example.wasitthaphon.repositories.FeatureOptionRepository;
import com.example.wasitthaphon.repositories.FeatureRepository;
import com.example.wasitthaphon.repositories.ProductImageRepository;
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

	@Autowired
	private FeatureOptionRepository featureOptionRepository;

	@Autowired
	ProductImageRepository productImageRepository;

	@PostConstruct
	public void InitialProducts() {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();
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
		product1.setOnhandQuantity(20);
		product1.setDiscountExpiredDate(formatter.format(date));
		product1.setSellCity("ขอนแก่น");
		product1.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
		product1.setRating(40.0);
		product1.setReviewerCount(70);

		product2.setId(2);
		product2.setStoreId(2);
		product2.setTitle("Biggy Adidas NMD Normal Green");
		product2.setPrice(15900.0);
		product2.setHasDiscount(true);
		product2.setDiscount(34);
		product2.setOnhandQuantity(20);
		product2.setDiscountExpiredDate(formatter.format(date));
		product2.setSellCity("ขอนแก่น");
		product2.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
		product2.setRating(40.0);
		product2.setReviewerCount(70);

		product3.setId(3);
		product3.setStoreId(3);
		product3.setTitle("Black Friday hwak Adidas NMD");
		product3.setPrice(15900.0);
		product3.setHasDiscount(true);
		product3.setOnhandQuantity(10);
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
		product4.setHasDiscount(true);
		product4.setOnhandQuantity(5);
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
		product5.setHasDiscount(true);
		product5.setDiscount(34);
		product5.setOnhandQuantity(6);
		product5.setDiscountExpiredDate(formatter.format(date));
		product5.setSellCity("ขอนแก่น");
		product5.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
		product5.setRating(40.0);
		product5.setReviewerCount(70);

		product6.setId(6);
		product6.setStoreId(6);
		product6.setTitle("Hexa mana sand Adidas NMD");
		product6.setPrice(15900.0);
		product6.setHasDiscount(true);
		product6.setOnhandQuantity(2);
		product6.setDiscount(34);
		product6.setDiscountExpiredDate(formatter.format(date));
		product6.setSellCity("ขอนแก่น");
		product6.setProductProfileImageUrl("www.pic-zip.com/adidas-nmd-a.jpg");
		product6.setRating(40.0);
		product6.setReviewerCount(70);

		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);

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
		ProductImage productImage6 = new ProductImage();

		List<FeatureOption> featureOptions1List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions2List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions3List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions4List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions5List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions6List = new ArrayList<FeatureOption>();
		List<FeatureOption> featureOptions7List = new ArrayList<FeatureOption>();

		List<Feature> features1 = new ArrayList<Feature>();
		List<Feature> features2 = new ArrayList<Feature>();
		List<Feature> features3 = new ArrayList<Feature>();
		List<Feature> features4 = new ArrayList<Feature>();
		List<Feature> features5 = new ArrayList<Feature>();
		List<Feature> features6 = new ArrayList<Feature>();

		List<ProductImage> productImages1 = new ArrayList<ProductImage>();
		List<ProductImage> productImages2 = new ArrayList<ProductImage>();
		List<ProductImage> productImages3 = new ArrayList<ProductImage>();
		List<ProductImage> productImages4 = new ArrayList<ProductImage>();
		List<ProductImage> productImages5 = new ArrayList<ProductImage>();
		List<ProductImage> productImages6 = new ArrayList<ProductImage>();

		feature.setId(1);
		feature.setName("Size");
		feature.setIsRequired(true);
		feature.setProduct(product1);

		featureRepository.save(feature);

		featureOption1.setFeature(feature);
		featureOption1.setFeatureOptionId(1);
		featureOption1.setOption("Size");
		featureOptions1List.add(featureOption1);
		featureOption2.setFeature(feature);
		featureOption2.setFeatureOptionId(2);
		featureOption2.setOption("EU:40");
		featureOptions1List.add(featureOption2);

		feature.setFeatureOptions(featureOptions1List);

		featureOptionRepository.save(featureOption1);
		featureOptionRepository.save(featureOption2);
		featureRepository.save(feature);

		feature2.setId(2);
		feature2.setName("Color");
		feature2.setIsRequired(true);
		feature2.setProduct(product2);

		featureRepository.save(feature2);

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

		featureOptionRepository.save(featureOption3);
		featureOptionRepository.save(featureOption4);

		feature2.setFeatureOptions(featureOptions2List);
		featureRepository.save(feature2);

		featureRepository.save(feature);
		featureRepository.save(feature2);

		features1.add(feature);
		features1.add(feature2);
		product1.setFeatures(features1);

		productImage1.setId(1);
		productImage1.setProduct(product1);
		productImage1.setProductImageUrl("https://www.google.com");
		productImageRepository.save(productImage1);
		productImages1.add(productImage1);
		product1.setProductImages(productImages1);

		productRepository.save(product1);

		feature3.setId(3);
		feature3.setProduct(product2);
		feature3.setName("Size");
		feature3.setIsRequired(true);

		featureRepository.save(feature3);

		featureOption6.setFeature(feature3);
		featureOption6.setFeatureOptionId(6);
		featureOption6.setOption("Size");
		featureOptions3List.add(featureOption6);
		featureOption7.setFeature(feature3);
		featureOption7.setFeatureOptionId(7);
		featureOption7.setOption("EU:33");
		featureOptions3List.add(featureOption7);

		featureOptionRepository.save(featureOption6);
		featureOptionRepository.save(featureOption7);

		feature3.setFeatureOptions(featureOptions3List);
		featureRepository.save(feature3);

		features2.add(feature3);
		product2.setFeatures(features2);

		productImage2.setId(2);
		productImage2.setProduct(product2);
		productImage2.setProductImageUrl("https://www.facebook.com");
		productImages2.add(productImage2);
		productImageRepository.save(productImage2);
		product2.setProductImages(productImages2);

		productRepository.save(product2);

		feature4.setId(4);
		feature4.setProduct(product3);
		feature4.setName("Size");
		feature4.setIsRequired(true);

		featureRepository.save(feature4);

		featureOption8.setFeature(feature4);
		featureOption8.setFeatureOptionId(8);
		featureOption8.setOption("Size");
		featureOptions4List.add(featureOption8);
		featureOption9.setFeature(feature4);
		featureOption9.setFeatureOptionId(9);
		featureOption9.setOption("EU:35");
		featureOptions4List.add(featureOption9);

		featureOptionRepository.save(featureOption8);
		featureOptionRepository.save(featureOption9);

		feature4.setFeatureOptions(featureOptions4List);
		featureRepository.save(feature4);

		productImage3.setId(3);
		productImage3.setProduct(product3);
		productImage3.setProductImageUrl("http://www.localhost.com");
		productImages3.add(productImage3);
		productImageRepository.save(productImage3);
		product3.setProductImages(productImages3);

		features3.add(feature4);
		product3.setFeatures(features3);

		productRepository.save(product3);

		feature5.setId(5);
		feature5.setProduct(product4);
		feature5.setName("Size");
		feature5.setIsRequired(true);

		featureRepository.save(feature5);

		featureOption10.setFeature(feature5);
		featureOption10.setFeatureOptionId(10);
		featureOption10.setOption("Size");
		featureOptions5List.add(featureOption10);
		featureOption11.setFeature(feature5);
		featureOption11.setFeatureOptionId(11);
		featureOption11.setOption("EU:40");
		featureOptions5List.add(featureOption11);

		featureOptionRepository.save(featureOption10);
		featureOptionRepository.save(featureOption11);

		feature5.setFeatureOptions(featureOptions5List);
		featureRepository.save(feature5);

		features4.add(feature5);

		productImage4.setId(4);
		productImage4.setProduct(product4);
		productImage4.setProductImageUrl("http://www.google.com/1");
		productImages4.add(productImage4);
		productImageRepository.save(productImage4);

		product4.setProductImages(productImages4);

		product4.setFeatures(features4);
		productRepository.save(product4);

		feature6.setId(6);
		feature6.setProduct(product5);
		feature6.setName("Size");
		feature6.setIsRequired(true);

		featureRepository.save(feature6);

		featureOption12.setFeature(feature6);
		featureOption12.setFeatureOptionId(12);
		featureOption12.setOption("Size");
		featureOptions6List.add(featureOption12);
		featureOption13.setFeature(feature6);
		featureOption13.setFeatureOptionId(13);
		featureOption13.setOption("EU:40");
		featureOptions6List.add(featureOption13);

		featureOptionRepository.save(featureOption12);
		featureOptionRepository.save(featureOption13);

		feature6.setFeatureOptions(featureOptions6List);
		featureRepository.save(feature6);

		features5.add(feature6);
		
		productImage5.setId(5);
		productImage5.setProduct(product5);
		productImage5.setProductImageUrl("www.google.com");
		productImages5.add(productImage5);
		productImageRepository.save(productImage5);

		product5.setProductImages(productImages5);
		product5.setFeatures(features5);
		productRepository.save(product5);

		feature7.setId(7);
		feature7.setProduct(product6);
		feature7.setName("Size");
		feature7.setIsRequired(true);

		featureRepository.save(feature7);

		featureOption14.setFeature(feature7);
		featureOption14.setFeatureOptionId(14);
		featureOption14.setOption("Size");
		featureOptions7List.add(featureOption14);
		featureOption15.setFeature(feature7);
		featureOption15.setFeatureOptionId(15);
		featureOption15.setOption("EU:40");
		featureOptions7List.add(featureOption15);

		featureOptionRepository.save(featureOption14);
		featureOptionRepository.save(featureOption15);

		feature7.setFeatureOptions(featureOptions7List);
		featureRepository.save(feature7);

		features6.add(feature7);
		product6.setFeatures(features6);

		productImage6.setId(6);
		productImage6.setProduct(product6);
		productImage6.setProductImageUrl("www.google.com");

		productImages6.add(productImage6);
		productImageRepository.save(productImage6);

		product6.setProductImages(productImages6);
		productRepository.save(product6);

	}

	public static void main(String[] args) {
		SpringApplication.run(WasitthaphonApplication.class, args);
	}

}
