package com.example.demo.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	void saveImageFile(String recipeID, MultipartFile imageFile);

}
