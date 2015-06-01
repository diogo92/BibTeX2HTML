<#list InproceedingsList as InproceedingsData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${InproceedingsData.citationKey}</li>
			<li>${InproceedingsData.author}
				(${InproceedingsData.year}
				<#if InproceedingsData.month??>
				,${InproceedingsData.month}
				</#if>).
				<i>${InproceedingsData.booktitle}</i> 
				${InproceedingsData.title}
				<#if InproceedingsData.volume??>
				,vol. ${InproceedingsData.volume}
				</#if>
				<#if InproceedingsData.pages??>
				,p. ${InproceedingsData.pages}
			</#if>
			<#if InproceedingsData.address??>
				,${InproceedingsData.address}
			</#if>
			<#if InproceedingsData.publisher??>
				,${InproceedingsData.publisher}
			</#if>		
			<#if InproceedingsData.editor??>
				,${InproceedingsData.editor}
			</#if>
			<#if InproceedingsData.series??>
				,${InproceedingsData.series} series
			</#if>
			<#if InproceedingsData.organization??>
				,${InproceedingsData.organization}
			</#if>
			<#if InproceedingsData.note??>
				,${InproceedingsData.note}
			</#if>
			<#if InproceedingsData.key??>
				,${InproceedingsData.key}
			</#if>
			<#if InproceedingsData.crossref??>
				,${InproceedingsData.crossref}
			</#if></li>
		</ul>
	</div>
</#list>