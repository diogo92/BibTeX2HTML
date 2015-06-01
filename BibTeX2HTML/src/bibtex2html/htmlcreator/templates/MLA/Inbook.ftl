<#list InbookList as InbookData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${InbookData.citationKey}</li>
			<li>${InbookData.author} 
			
			"${InbookData.title}"
			<#if InbookData.volume??>
				,vol. ${InbookData.volume}
			</#if>
			
			<#if InbookData.address??>
				,${InbookData.address}
			</#if>
			 <i>,${InbookData.publisher}</i>
			 (${InbookData.year}
			<#if InbookData.month??>
				,${InbookData.month}
			</#if>). 
			,chapter ${InbookData.chapter}
			<#if InbookData.series??>
				,${InbookData.series}
			</#if>

			<#if InbookData.type??>
				,${InbookData.type}
			</#if>
			
			<#if InbookData.edition??>
				,${InbookData.edition} edition
			</#if>
			<#if InbookData.note??>
				,${InbookData.note}
			</#if>
			<#if InbookData.key??>
				,${InbookData.key}
			</#if>
			<#if InbookData.crossref??>
				,${InbookData.crossref}
			</#if>
			<#if InbookData.pages??>
				,p. ${InbookData.pages}
			</#if></li>
		</ul>
	</div>
</#list>