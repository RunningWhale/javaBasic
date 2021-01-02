接收请求的参数
    接收请求参数，使用处理器方法的形参：
    1、HttpServletRequest
    2、HttpServletResponse
    3、HttpSession
    4、用户提交的数据
    接收用户提交的参数
    1、逐个接收
    2、对象接收

注意：提交请求参数，get没有中文乱码，post有乱码，使用过滤器处理
过滤器可以自定义，或使用框架中的过滤器CharacterEncodingFilter