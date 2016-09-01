using System.Web.Http;
using WebApiSwagger;
using WebActivatorEx;
using Swashbuckle.Application;
using RecolhimentoMicroServico;

[assembly: PreApplicationStartMethod(typeof(SwaggerConfig), "Register")]

namespace RecolhimentoMicroServico
{
    public class SwaggerConfig
    {
        public static void Register()
        {
            Swashbuckle.Bootstrapper.Init(GlobalConfiguration.Configuration);

            // NOTE: If you want to customize the generated swagger or UI, use SwaggerSpecConfig and/or SwaggerUiConfig here ...

            SwaggerSpecConfig.Customize(c =>
            {
                c.IncludeXmlComments(GetXmlCommentsPath());
            });
        }

        protected static string GetXmlCommentsPath()
        {
            return System.String.Format(@"{0}\bin\RecolhimentoMicroServico.XML", System.AppDomain.CurrentDomain.BaseDirectory);
        }
    }
}