package com.galvanize;

class Template {
    private String content;

    public String getContent() {
        System.out.println("this in parent " +this.content);
        return content;
    }

    public void setContent(String content) { this.content = content; }

    public String toHTML() {
        return String.format("<div class=\"wrapper\">%s</div>", getContent());
    }
}

class Panel extends Template {
//    @Override
//    public String getContent() {
////        System.out.println("this content now: ", this.content);
//        return "<div class=\"panel\">" + super.getContent() + "</div>";
//    }
}

