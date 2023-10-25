package org.example;

import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run() {
        Scanner sc = new Scanner(System.in);
        List<Article> articleList = new ArrayList<>();
        List<User> userList = new ArrayList<>();
        long lastId = 1;
        System.out.println("== 프로그램 시작 ==");

        while (true) {
            System.out.print("명령어: ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                System.out.println("== 시스템을 종료합니다 ==");
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목: ");
                String title = sc.nextLine();

                System.out.print("내용: ");
                String body = sc.nextLine();

                Article article = new Article(lastId, title, body);
                articleList.add(article);

                System.out.println("== " + lastId + "번 게시글이 등록되었습니다 ==");
                lastId++;
            } else if (command.equals("목록")) {
                System.out.println("id / title / body");
                if (articleList.isEmpty()) {
                    System.out.println("== 등록된 게시글이 없습니다 ==");
                } else {
                    for (int i = 0; i < articleList.size(); i++) {
                        Article article = articleList.get(i);
                        System.out.printf("%d / %s / %s\n", article.getId(), article.getTitle(), article.getBody());
                    }
                }
            } else if (command.equals("삭제")) {
                System.out.print("삭제할 게시물 id: ");
                long id = Long.parseLong(sc.nextLine());

                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    if (article.getId() == id) {
                        articleList.remove(article);
                    }
                }
                System.out.println("== " + id + "번 게시글이 삭제되었습니다 ==");
            } else if (command.equals("수정")) {
                System.out.print("수정할 게시물 id: ");
                long id = Long.parseLong(sc.nextLine());

                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    if (article.getId() == id) {
                        System.out.print("수정할 제목: ");
                        String title = sc.nextLine();
                        article.setTitle(title);

                        System.out.print("수정할 내용: ");
                        String body = sc.nextLine();
                        article.setBody(body);
                    }
                }
            } else if (command.equals("회원가입")) {
                String userId;
                String password;
                String passwordconfirm;

                System.out.print("아이디: ");
                userId = sc.nextLine();
                while (true) {
                    System.out.print("비밀번호: ");
                    password = sc.nextLine();
                    System.out.print("비밀번호 재확인: ");
                    passwordconfirm = sc.nextLine();

                    if (password != passwordconfirm) {
                        System.out.println("== 비밀번호가 다릅니다 ==\n== 다시 입력해 주세요 ==");
                        continue;
                    }
                    User user = new User(userId, password);
                    userList.add(user);
                      System.out.println("== 회원가입이 완료되었습니다 ==");
                    break;
                }
            }
//            else if (command.equals("로그인")) {
//                System.out.print("아이디: ");
//                String userId = sc.nextLine();
//                System.out.print("비밀번호: ");
//                String password = sc.nextLine();
//
//                User user = new User(userId, password);
//
//                for (int i = 0; i < userList.size(); i++) {
//                    if (user == userList.get(i)) {
//                        System.out.println("== 로그인이 완료되었습니다 ==");
//                    } else {
//                        System.out.println("== 계정이 존재하지 않습니다 ==\n== 다시 입력해 주세요 ==");
//                        continue;
//                    }
//                }
//            }
        }
    }
}
