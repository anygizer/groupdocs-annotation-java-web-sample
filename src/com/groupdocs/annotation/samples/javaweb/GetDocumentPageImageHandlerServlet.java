package com.groupdocs.annotation.samples.javaweb;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author imy
 */
public class GetDocumentPageImageHandlerServlet extends AnnotationServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int width = Integer.parseInt(request.getParameter("width"));
            int quality = Integer.valueOf(request.getParameter("quality"));
            boolean usePdf = Boolean.valueOf(request.getParameter("usePdf"));
            int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
            String path = request.getParameter("path");
            annotationHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, response);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Not needed
    }
}
