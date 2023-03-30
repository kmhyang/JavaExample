//package com.yedam.hwork;
//
//public class hw230330 {
//	package com.yedam.homework;
//
//	public class Product {
//		String productName;
//		int price;	
//	}
//
//	package com.yedam.homework;
//
//	import java.util.Scanner;
//
//	public class homework {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int productCnt = 0;
//			Product[] products = null;
//			while (true) {
//				System.out.println("----------------------------------------------------");
//				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
//				System.out.println("----------------------------------------------------");
//				System.out.println("메뉴를 입력하세요:");
//				int menu = Integer.parseInt(sc.nextLine());
//
//				if (menu == 1) {
//					System.out.println("상품 수를 입력하세요.");
//					productCnt = Integer.parseInt(sc.nextLine());
//				} else if (menu == 2) {
//					products = new Product[productCnt];
//					for (int i = 0; i < products.length; i++) {
//						products[i] = new Product();
//						System.out.println("상품명 입력 > ");
//						products[i].productName = sc.nextLine();
//						System.out.println("가격 입력 > ");
//						products[i].price = Integer.parseInt(sc.nextLine());
//					}
//				} else if (menu == 3) {
//					for (Product i : products) {
//						System.out.println(i.productName + " : " + i.price + "원");
//					}
//				} else if (menu == 4) {
//					int max = products[0].price;
//					int maxIndex = 0;
//					int total = 0;
//					for (int i = 0; i < products.length; i++) {
//						if (max < products[i].price) {
//							maxIndex = i;
//						}
//					}
//					System.out.println("최고가격 제품 [" + products[maxIndex].productName + "]의 가격 : " + products[maxIndex].price);
//					for (int i = 0; i < products.length; i++) {
//						if (i != maxIndex) {
//							total += products[i].price;
//						}
//					}
//					System.out.println("최고 가격 제외 다른제품 가격의 총합 : " + total);
//				} else if (menu == 5) {
//					break;
//				} else {
//					System.out.println("메뉴를 잘못 고르셨습니다.");
//				}
//			}
//			System.out.println("프로그램 종료");
//		}
//	}
//
//}
