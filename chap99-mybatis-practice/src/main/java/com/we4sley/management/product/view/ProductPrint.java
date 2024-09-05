package com.we4sley.management.product.view;

import com.we4sley.common.SearchCondition;
import com.we4sley.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {

        // 1. 전체 조회한 목록 출력하는 메소드
        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.println("===== 상품 목록 =====");
        for (ProductDTO productDTO : allProductList) {
            System.out.println(productDTO);
        }

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.println("===== 검색 조건 =====");
        switch (searchCondition.getOption()) {
            case "productName":
                System.out.println("제품명 : " + searchCondition.getValue());
                break;
            case "salesStore":
                System.out.println("판매점 유형 : " + searchCondition.getValue());
                break;
        }

        System.out.println("===== 상품 목록 =====");
        for (ProductDTO productDTO : productList) {
            System.out.println(productDTO);
        }
    }

    public void printSuccessMessage(String successCode) {

        // 3. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.
        System.out.println("===== Success =====");
        String successMessage = "";

        switch (successCode) {
            case "registNewProduct":
                successMessage = "신규 제품 정보 등록 성공";
                break;
            case "modifyProductInfo":
                successMessage = "기존 제품 정보 수정 성공";
                break;
            case "deleteProduct":
                successMessage = "판매부진 단종 제품 삭제 성공";
                break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        // 4. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.
        System.out.println("===== Error =====");
        String errorMessage = "";

        switch (errorCode) {
            case "selectAllList":
                errorMessage = "전체 상품 목록 조회에 실패했습니다.";
                break;
            case "selectListByCondition":
                errorMessage = "특정 상품 목록 조회에 실패했습니다.";
                break;
            case "registNewProduct":
                errorMessage = "신규 제품 정보 등록 실패";
                break;
            case "modifyProductInfo":
                errorMessage = "기존 제품 정보 수정 실패";
                break;
            case "deleteProduct":
                errorMessage = "판매부진 단종 제품 삭제 실패";
                break;
        }

        System.out.println(errorMessage);
    }
}
