package demo.servlet.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RoundListener implements ServletContextListener, ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("Context 영역에 값이 추가 되었습니다.");
        System.out.println("added = " + event.getName() + ":" + event.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("Context 영역에 값이 삭제 되었습니다.");
        System.out.println("removed = " + event.getName() + ":" + event.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("Context 영역에 값이 변경 되었습니다.");
        System.out.println("replaced = " + event.getName() + ":" + event.getValue());
    }

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext 가 초기화 되었습니다.");
        System.out.println("init context = " + sce.getServletContext()
        );
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext가 소멸 되었습니다.");
        System.out.println("dest context =" + sce.getServletContext());
    }
}
