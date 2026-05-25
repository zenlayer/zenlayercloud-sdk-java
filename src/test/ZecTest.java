import com.aliyun.tea.TeaRequest;
import com.aliyun.tea.TeaResponse;
import com.aliyun.tea.interceptor.InterceptorContext;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.tea.utils.AttributeMap;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.TokenCredential;
import com.zenlayercloud.zec20240401.ZecClient;
import com.zenlayercloud.zec20240401.models.*;
import org.junit.Before;
import org.junit.Test;


public class ZecTest {

    ZecClient client;

    @Before
    public void initClient() {
        final Config config = new Config();
        config.setReadTimeout(100000);
        config.setConnectTimeout(100000);
        config.setProtocol("https");

        // dev team 7b28aa0f-3257-44fb-ac74-e37423553e32 sherlock
//        Credential credential = new Credential("v3rcxE9t9Dr6M6PZ", "XX9Dxcw9auzpv67RB8nAavPREcu0Lu");
//        Credential credential = new Credential("lJG8i5czGZvdh6Tv", "1J1MHZIYWQI0RpYWpRv8tuIQMkHtBh");
        TokenCredential credential = new TokenCredential("pat_7bf3653fdfc31ad192f3148b6b2ca573bfd05a1bf4fa9728bfd80795acea88cb");
        config.setEndpoint("portal-dev.hzk8s.com");

        // ci team 7b090a2d-d802-4384-877e-410b738f5b55 sherlock-ci
        //Credential credential = new Credential("nsSYqk5d8SJdIq2D", "mquxEzDX8ZfTHLfqoMcQ2UVzVV0ohN");
        //config.setEndpoint("portal.hzk8s.com");

        client = new ZecClient(credential, config);
        client.addRequestInterceptor(new RequestInterceptor() {
            @Override
            public TeaRequest modifyRequest(InterceptorContext context, AttributeMap attributes) {
                return context.teaRequest();
            }
        });
        client.addResponseInterceptor(new ResponseInterceptor() {
            @Override
            public TeaResponse modifyResponse(InterceptorContext context, AttributeMap attributes) {

                return context.teaResponse();
            }

        });
    }

    @Test
    public void testDescribeZones() {
        DescribeDiskRegionsRequest request = new DescribeDiskRegionsRequest();
        DescribeDiskRegionsResponse response = client.describeDiskRegions(request);
        System.out.println(response);
    }

    @Test
    public void testDescribeZonesCidr() {
        InquiryPriceCreateDisksRequest request = new InquiryPriceCreateDisksRequest();
        request.zoneId = "SH1A";
        request.diskSize = 20;
        InquiryPriceCreateDisksResponse response = client.inquiryPriceCreateDisks(request);
        System.out.println(response);
    }

}
